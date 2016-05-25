;; wagnersq's solution to Reverse a Sequence
;; https://4clojure.com/problem/23

(def answer1 (fn reverse-seq [xs]
  (into '() xs)))

(= (answer1 [1 2 3 4 5]) [5 4 3 2 1])

(= (answer1 (sorted-set 5 7 2 7)) '(7 5 2))

(= (answer1 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])


(def answer2 #(reduce conj () %))

(= (answer2 [1 2 3 4 5]) [5 4 3 2 1])

(= (answer2 (sorted-set 5 7 2 7)) '(7 5 2))

(= (answer2 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
