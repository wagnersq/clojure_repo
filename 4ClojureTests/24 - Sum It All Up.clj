;; wagnersq's solution to Sum It All Up
;; https://4clojure.com/problem/24

(def answer1 (fn sum-it-al [lat]
  (reduce + lat)))

(= (answer1 [1 2 3]) 6)

(= (answer1 (list 0 -2 5 5)) 8)

(= (answer1 #{4 2 1}) 7)

(= (answer1 '(0 0 -1)) -1)

(= (answer1 '(1 10 3)) 14)


(def answer2 #(reduce + %))

(= (answer2 [1 2 3]) 6)

(= (answer2 (list 0 -2 5 5)) 8)

(= (answer2 #{4 2 1}) 7)

(= (answer2 '(0 0 -1)) -1)

(= (answer2 '(1 10 3)) 14)
