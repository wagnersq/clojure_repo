;; wagnersq's solution to Penultimate Element
;; https://4clojure.com/problem/20

(def answer #(second (reverse %)))

(= (answer (list 1 2 3 4 5)) 4)

(= (answer ["a" "b" "c"]) "b")

(= (answer [[1 2] [3 4]]) [1 2])
