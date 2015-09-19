; namespace
(ns learnclojure)

; function
(print "Hello world")

; math function
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

; Macro
(type :a)
(type (keyword "a"))

(type (quote a))
(type 'a')

; List definition
(type '(1 2 3))
(type (list 1 2 3))
(type '(print 2 3))
(type (print 2 3))


