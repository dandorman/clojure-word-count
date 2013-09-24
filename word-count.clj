(ns phrase
  (:use [clojure.string :only [lower-case replace split]]))

(defn word-count
  [string]
  (let [normalized-string (replace (lower-case string) #"[^a-z0-9 ]" "")
        words (split normalized-string #"\s+")]
    (reduce (fn [counts word]
              (if (nil? (get counts word))
                (assoc counts word 1)
                (assoc counts word (inc (get counts word)))))
            {}
            words)))
