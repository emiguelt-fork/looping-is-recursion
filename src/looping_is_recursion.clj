(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc n]
                 (if (zero? n)
                   acc
                   (recur (* acc base) (- n 1))))]
    (helper 1 exp)))

(defn last-element [a-seq]
  (let [helper (fn [acc seq-a]
                 (if (empty? seq-a)
                   acc
                   (recur (first seq-a) (rest seq-a))))]
    (helper nil a-seq)))

(defn seq= [seq1 seq2]
  (let [helper (fn [acc seqa, seqb]
                 (if (and (empty? seqa) (empty? seqb)) true
                   (if (or (empty? seqa) (empty? seqb)) false
                     (if (not acc)
                       false
                       (recur (= (first seqa) (first seqb))
                              (rest seqa)
                              (rest seqb))))))]
        (helper true seq1 seq2)))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

