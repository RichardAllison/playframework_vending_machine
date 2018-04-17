name := """VendingMachine"""
organization := "com.richardallison"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1206-jdbc42"
libraryDependencies += evolutions
