import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object GeneralReports{
	val TOPIC = "missmalini"
	val TOPIC_NAME = "MissMalini"
	val REPORT_DIR = "/home/xiaoluguo/missmalini/"
	val DATA_ROOT = "hdfs://10.142.0.63:9000/data"
	val ARCHIVE_ROOT = "hdfs://10.142.0.63:9000/" + TOPIC
	val ENTITY_FILE = TOPIC + "_entities2.txt"
	val SLICES = 2000
	
	//def safe_date_from_str(input:String) : String = {
	//}
	
	//def safe_float(input:String) : Float ={
	//}

	def main(args: Array[String]) {
	
	}
}



