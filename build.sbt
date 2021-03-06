import sbt.complete._
import sbt.complete.DefaultParsers._
import java.io.File

scalaVersion := "2.12.1"
name := "DoMongoOperations"
version := "0.0.1-SNAPSHOT"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "1.2.1"
libraryDependencies += "io.reactivex" %% "rxscala" % "0.26.5"
mainClass in assembly := Some("irms.ImportXYZ")
assemblyMergeStrategy in assembly := {
	case "FunctionalGroups.txt" => MergeStrategy.deduplicate
	case PathList("irms", xs @ _*) => MergeStrategy.deduplicate
	case PathList("org","mongodb", xs @ _*) => MergeStrategy.deduplicate
	case PathList("org","bson", xs @ _*) => MergeStrategy.deduplicate
	case PathList("com","mongodb", xs @ _*) => MergeStrategy.deduplicate
	case PathList("rx", xs @ _*) => MergeStrategy.deduplicate
	case PathList("rxScala", xs @ _*) => MergeStrategy.deduplicate
	case x => MergeStrategy.discard
}
