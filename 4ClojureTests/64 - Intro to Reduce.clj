;; wagnersq's solution to Intro to Reduce
;; https://4clojure.com/problem/64

(clojure.test/testing

  "Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence
  (or the starting value and the first element of the sequence).
  In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value."

  (clojure.test/is (and

      (= 15 (reduce + [1 2 3 4 5]))

      (=  0 (reduce + []))

      (=  6 (reduce + 1 [2 3]))
    )
  )
)
