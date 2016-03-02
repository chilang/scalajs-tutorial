module.exports = function(config) {
  config.set({
    plugins: ['karma-chrome-launcher', 'karma-scalajs-scalatest'],
    reporters: ['progress'],
    frameworks: ['scalajs-scalatest'],
    files: [
      'target/scala-2.11/scala-js-tutorial-test-jsdeps.js',
      'target/scala-2.11/scala-js-tutorial-test-fastopt.js'
    ],

    browsers: process.env.TRAVIS ? ['Firefox'] : ['Chrome'],

    autoWatch: true,

    client: {
      tests: [
        "tutorial.webapp.TutorialTest"
      ]
    }
  });
};
