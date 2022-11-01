package main.scala.demo

import org.apache.poi.ss.usermodel._
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.{FileInputStream, FileOutputStream, InputStream, OutputStream}
case class RowData(mobile:String,no:String,question:String,answer:String)

object excelTest extends App {
  val sourcePath:String = "C:\\Users\\Tomotaku\\Desktop\\问卷空白答案明细1031.xlsx"
  val resPath:String = "C:\\Users\\Tomotaku\\Desktop\\问卷空白答案明细1031_res.xlsx"
  val rowDataList:List[RowData] = getSourceData(sourcePath)
  val workbook:Workbook = printFile(rowDataList)
  try{
    val os:OutputStream = new FileOutputStream (resPath)
    {
      workbook.write(os);
      os.flush();
    }
  }
  catch {
    case e: Exception => e.printStackTrace()
  }
  def getSourceData(sourcePath: String):List[RowData] = {
    val inputStream: InputStream = new FileInputStream(sourcePath)
    val workbook:Workbook = new XSSFWorkbook(inputStream)
  }
  
  def printFile(rowDataList: List[RowData]) = {

  }

}
