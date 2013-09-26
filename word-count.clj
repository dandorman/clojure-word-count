(ns phrase
  (:require [clojure.string :refer [lower-case]]))

(defn word-count
  [string]
  (let [words (re-seq #"\w+" (lower-case string))]
    (frequencies words)))
