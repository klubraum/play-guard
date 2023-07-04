credentials += Credentials("GitHub Package Registry", "maven.pkg.github.com", "klubraum", System.getenv("GITHUB_TOKEN"))
resolvers ++= Seq("Playframework".at("https://maven.pkg.github.com/klubraum/playframework"))
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.0-RC5")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
