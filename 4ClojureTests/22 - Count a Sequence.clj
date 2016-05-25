;; wagnersq's solution to Count a Sequence
;; https://4clojure.com/problem/22

(def answer1 (fn count-seq [xs]
  (reduce (fn [sum _] (inc sum)) 0 xs)))

(= (answer1 '(1 2 3 3 1)) 5)

(= (answer1 "Hello World") 11)

(= (answer1 [[1 2] [3 4] [5 6]]) 3)

(= (answer1 '(13)) 1)

(= (answer1 '(:a :b :c)) 3)


(def answer2 #(reduce + (map (constantly 1) %)))

(= (answer2 '(1 2 3 3 1)) 5)

(= (answer2 "Hello World") 11)

(= (answer2 [[1 2] [3 4] [5 6]]) 3)

(= (answer2 '(13)) 1)

(= (answer2 '(:a :b :c)) 3)
