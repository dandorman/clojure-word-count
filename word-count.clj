(ns phrase
  (:use [clojure.string :only [lower-case split]]))

(defn word-count
  [string]
  (let [normalized-string (clojure.string/replace (lower-case string) #"[^a-z0-9 ]" "")
        words (split normalized-string #"\s+")]
    (frequencies words)))
