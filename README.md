# Environment
* node.js: 12.16.1
* jest: 26.0.1

# Project Initialization Flow
(1) create project
```sh
mkdir my_node_app
cd my_node_app
npm init
```

(2) enable Jest dependencies
```sh
npm install -dev--save jest
```
Then the `package.json` as this:
```json
{
  "name": "poker-hands-node-npm2",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "test": "jest"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {
    "jest": "^26.0.1"
  }
}
```
> And please pay attentation that: jest version > 26, then the nodejs 8 is not supported, so, if your nodejs version is <=8, should use jest <=v25

(3) write sample
```sh
mkdir src
cd src
touch sample.js
```
then create a function in `sample.js`:
```js
function sample() {
    return "AAA"
}

module.exports = sample;
```

(4) write test for sample
```
mkdir test
cd test
touch sample.test.js
```
then create test case at `sample.test.js`:
```js
const sample = require('./../src/sample');

test('should return AAA when sample()', () => {
    expect(sample()).toBe('AAA');
})
```
(5) Finally, run `npm run test`


# Reference Link
* https://jestjs.io/docs/zh-Hans/getting-started.html
* https://www.jianshu.com/p/70a4f026a0f1