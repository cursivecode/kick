(ns {{name}}.app-test
  (:require [{{name}}.app :as app])
  (:require-macros [jasmine-cljs.macros :refer [describe it expect dont-expect]]
                   [protractor-cljs.macros :refer [by get-elem browser]]))

(describe "Addition"
  (it "should add two to number"
    (expect (app/add-two 10) :to-be 12))
  (it "should not add three"
    (dont-expect (app/add-two 5) :to-be 8)))


(describe "angularjs homepage - cljs"
  (it "should greet the named user"
      (browser :get "http://www.angularjs.org")

      (-> (get-elem (by :model "yourName"))
          (.sendKeys "Julie"))

      (let [greeting (get-elem (by :binding "yourName"))]
        (expect (.getText greeting) :to-equal "Hello Julie!"))))
