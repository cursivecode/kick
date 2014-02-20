(ns leiningen.new.kick
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "kick"))

(defn kick [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ["karma.conf.js" (render "karma.conf.js" data)]
             ["externs/angular.js" (render "angular.js" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src-cljs/{{sanitized}}/app.clj" (render "app.clj" data)]
             ["test-cljs/{{sanitized}}/app_test.clj" (render "app_test.clj" data)]
             )))
