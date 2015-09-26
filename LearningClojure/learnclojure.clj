; namespace
(ns learnclojure)

; function
(print "Hello world")

; Math operation
(+ 1 1)
(- 2 1)
(* 2 4)
(/ 4 2)
(* 3 (- 2 1))

; Object Type Verification
(type 1)
(type 1.1)
(type true)
(type "Hello")

; Macro or Map
(type :a)
(type (keyword "a"))

; Symbol
(type (quote a))
(type 'a)

; List definition
(type '(1 2 3)) ; linked list
(type (list 1 2 3))
(type '(print 2 3))
(type (print 2 3))

; Vector
(type (vector 3 2 1)) ; array
(type [3 2 1])        ; array

; Value of N-th array position
(nth (vector 9 5 13) 1)

; Value of first item of list
(first '(8 0 -9 3))

; Value of last item of list
(last '(8 0 -9 3 7))

; Map
{:a 0, :b 4, :c 2}
{:a {:b -1, :c 1}}
(type (hash-map :a 1 :b 2))

; Set
(type #{1 2 3})
(type (hash-set 1 4 5))

; Binding definition
(defn x [a b]
  (let [ab (* a b)]
    (+ ab 3)))

(x 4 3)

