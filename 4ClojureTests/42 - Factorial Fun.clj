;; wagnersq's solution to Factorial Fun
;; https://4clojure.com/problem/24

(defn  factorial [n]
  (reduce * (range 1 (inc n))))

(clojure.test/testing

  "Write a function which calculates factorials."

  (clojure.test/is (and

      (= (factorial 1) 1)

      (= (factorial 3) 6)

      (= (factorial 5) 120)

      (= (factorial 8) 40320)
    )
  )
)
