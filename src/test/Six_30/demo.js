function isCircularSentence(sentence) {
    var length = sentence.length;
    for (var i = 0; i < length; i++) {
        if (sentence.charAt(i) == ' ') {
            if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }
    }
    return sentence.charAt(0) == sentence.charAt(length - 1);
}