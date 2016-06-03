;; wagnersq's solution to Replicate a Sequence
;; https://4clojure.com/problem/33

(defn replicate-each-item [col n-times]
  (mapcat #(repeat n-times %1) col))

(clojure.test/testing

  "Write a function which replicates each element of a sequence a variable number of times."

  (clojure.test/is (and

      (= (replicate-each-item [1 2 3] 2) '(1 1 2 2 3 3))

      (= (replicate-each-item [:a :b] 4) '(:a :a :a :a :b :b :b :b))

      (= (replicate-each-item [4 5 6] 1) '(4 5 6))

      (= (replicate-each-item [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

      (= (replicate-each-item [44 33] 2) [44 44 33 33])
    )
  )
)
