import sbtcrossproject.{crossProject, CrossType}
lazy val `test-project` =
  crossProject(JSPlatform)
    .settings(
      name := "test-project",
      scalaVersion := "2.13.1",
      libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % Test,
      testFrameworks += new TestFramework("utest.runner.Framework")
    )
    .jsConfigure(
      _.settings(
        libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.2" % Test
      ))

lazy val `test-project-js` = `test-project`.js
