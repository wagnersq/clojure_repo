;; wagnersq's solution to Let it Be
;; https://4clojure.com/problem/36

(clojure.test/testing

  "Can you bind x, y, and z so that these are all true?"

  (clojure.test/is (and

      (= 10 (let [x 7 y 3 z 1] (+ x y)))

      (= 4 (let [x 7 y 3 z 1] (+ y z)))

      (= 1 (let [x 7 y 3 z 1] z))
    )
  )
)
