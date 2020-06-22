import sys
sys.path.append(r'D:\githome\TDD\poker-hands-python3-unittest') # TODO: Should update your project root dir location
from src.PokerHandsDemo import PokerHandsDemo

import unittest

class PokerHandsDemoTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        pass

    @classmethod
    def tearDownClass(cls):
        pass

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_should_return_AAA_when_analysePokerHands_given_input_string_is_AAA(self):
        self.assertEqual(PokerHandsDemo.analysePokerHands('AAA'), 'AAA')

    def test_should_return_BBB_when_analysePokerHands_given_input_string_is_BBB(self):
        self.assertEqual(PokerHandsDemo.analysePokerHands('BBB'), 'BBB')

if __name__ == '__main__':
    unittest.main()