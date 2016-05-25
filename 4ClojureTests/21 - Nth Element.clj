;; wagnersq's solution to Nth Element
;; https://4clojure.com/problem/21

(def answer1 #(get (vec %1) %2))

(= (answer1 '(4 5 6 7) 2) 6)

(= (answer1 [:a :b :c] 0) :a)

(= (answer1 [1 2 3 4] 1) 2)

(= (answer1 '([1 2] [3 4] [5 6]) 2) [5 6])


(def answer2 #(first (drop %2 %1)))

(= (answer2 '(4 5 6 7) 2) 6)

(= (answer2 [:a :b :c] 0) :a)

(= (answer2 [1 2 3 4] 1) 2)

(= (answer2 '([1 2] [3 4] [5 6]) 2) [5 6])


(def answer3 (defn nth-element [[x & xs] idx]
  (if (= idx 0) x
      (recur xs (dec idx)))))

(= (answer3 '(4 5 6 7) 2) 6)

(= (answer3 [:a :b :c] 0) :a)

(= (answer3 [1 2 3 4] 1) 2)

(= (answer3 '([1 2] [3 4] [5 6]) 2) [5 6])
