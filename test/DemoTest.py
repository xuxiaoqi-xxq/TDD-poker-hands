import sys
sys.path.append(r'D:\githome\TDD-poker-hands') # TODO: Should update your project root dir location
from src.Demo import Demo

import unittest

class DemoTest(unittest.TestCase):
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

    def test01(self):
        self.assertEqual(Demo.run(), 'ABC')

if __name__ == '__main__':
    unittest.main()