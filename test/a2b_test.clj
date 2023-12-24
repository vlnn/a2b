(ns a2b-test
  (:require [clojure.test :refer [deftest is testing]]
            [a2b :as sut]))

(deftest truthy
  (is (zero? 0)))

#_(deftest query
    (is (= nil (sut/query-tagged-thoughts-ids "test-tag"))))
