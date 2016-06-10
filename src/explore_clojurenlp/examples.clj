(ns explore-clojurenlp.examples
    (use opennlp.nlp)
    (use opennlp.treebank)
    (use opennlp.tools.filters))

  (def get-sentences
    (make-sentence-detector "models/en-sent.bin"))

  (def tokenize
    (make-tokenizer "models/en-token.bin"))

  (def pos-tag
    (make-pos-tagger "models/en-pos-maxent.bin"))

  (get-sentences "I like reading books. and I like watching action movies. i'm a clojure developer")

  (map tokenize (get-sentences "I like reading books. And I like watching goo movies."))

  (nouns (pos-tag (tokenize "Don't forget the milk.")))

