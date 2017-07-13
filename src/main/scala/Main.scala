import org.apache.spark.sql.SparkSession

object Main extends App {
  val spark = SparkSession.builder.appName("Simple Application").master("local").getOrCreate()
  val rdd = spark.sparkContext.parallelize(List(1, 2, 3, 4))
  rdd.map(_ * 2).collect().foreach(println)
  spark.close()
}
