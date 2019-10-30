// [Required] Enable plugin and automatically find def main(args:Array[String]) methods from the classpath
enablePlugins(PackPlugin)

// [Optional] Specify main classes manually
// This example creates `hello` command (target/pack/bin/hello) that calls org.mydomain.Hello#main(Array[String]) 
packMain := Map("eigentrust" -> "app.hoefax.computeeigentrust")
