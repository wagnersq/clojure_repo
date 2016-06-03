;; wagnersq's solution to Compress a Sequence
;; https://4clojure.com/problem/30

(defn del-consecutive-dups [col]
  (mapcat set (#(partition-by identity %1) col)))

(clojure.test/testing

  "Write a function which removes consecutive duplicates from a sequence."

  (clojure.test/is (and

      (= (apply str (del-consecutive-dups "Leeeeeerrroyyy")) "Leroy")

      (= (del-consecutive-dups [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

      (= (del-consecutive-dups [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
    )
  )
)
