;; wagnersq's solution to Local Bindings
;; https://4clojure.com/problem/35

(clojure.test/testing

  "Clojure lets you give local names to values using the special let-form."

  (clojure.test/is (and

      (= 7 (let [x 5] (+ 2 x)))

      (= 7 (let [x 3, y 10] (- y x)))

      (= 7 (let [x 21] (let [y 3] (/ x y))))
    )
  )
)
