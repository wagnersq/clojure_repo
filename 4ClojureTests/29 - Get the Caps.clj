;; wagnersq's solution to Get the Caps
;; https://4clojure.com/problem/29

(defn only-caps [s]
  (reduce str (filter #(Character/isUpperCase %1) s)))

(clojure.test/testing

  "Write a function which takes a string and returns a new string containing only the capital letters."

  (clojure.test/is (and

      (= (only-caps "HeLlO, WoRlD!") "HLOWRD")

      (empty? (only-caps "nothing"))

      (= (only-caps "$#A(*&987Zf") "AZ")
    )
  )
)
