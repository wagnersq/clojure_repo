;; wagnersq's solution to Regular Expressions
;; https://4clojure.com/problem/37

(clojure.test/testing

  "Regex patterns are supported with a special reader macro."

  (clojure.test/is (and

      (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
    )
  )
)
