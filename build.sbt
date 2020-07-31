name := "ElasticSearch"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe"          	 %      "config"                %   "1.2.1",
  "org.elasticsearch"         %    "elasticsearch"         % "2.4.1",
  "org.scalatest"              %%     "scalatest"    	        %   "2.2.2"      %     "test"
)

parallelExecution in Test := false