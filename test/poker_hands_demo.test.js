const analysePokerHands = require('./../src/poker_hands_demo');

test('should return AAA when analysePokerHands(\'ABC\')', () => {
    expect(analysePokerHands('ABC')).toBe('AAA');
})