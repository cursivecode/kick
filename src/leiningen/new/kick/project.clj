(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [protractor-cljs "0.1.1"]
                 [org.clojure/clojurescript "0.0-2156"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild
  {:builds [
            {:id "dev"
             :source-paths ["src-cljs" "test-cljs"]
             :compiler {:optimizations :simple
                        :pretty-print true
                        :output-to "resources/public/js/tests.js"}}
            {:id "prod"
             :source-paths ["src-cljs"]
             :compiler {:optimizations :advanced
                        :pretty-print false
                        :output-to "resources/public/js/main.js"}}]}) 
