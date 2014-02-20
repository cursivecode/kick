(ns {{name}}.app-test
  (:require [{{name}}.app :as app])
  (:require-macros [jasmine-cljs.macros :refer [describe it expect dont-expect]]))

(describe "Addition"
  (it "should add two to number"
    (expect (app/add-two 10) :to-be 12))
  (it "should not add three"
    (dont-expect (app/add-two 5) :to-be 8)))


