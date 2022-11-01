package main.scala.demo

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel._

import java.io.{FileInputStream, FileOutputStream, InputStream, OutputStream}
import scala.collection.mutable.ListBuffer
case class RowData(mobile:String,no:String,question:String,answer:String)

object excelTest extends App {
  val sourcePath:String = "C:\\Users\\Tomotaku\\Desktop\\问卷空白答案明细1031.xlsx"
  val resPath:String = "C:\\Users\\Tomotaku\\Desktop\\问卷空白答案明细1031_res.xlsx"
  val rowDataList:List[RowData] = getSourceData(sourcePath)
  val workbook:Workbook = printFile(rowDataList)
  try{
    val os:OutputStream = new FileOutputStream (resPath)
    {
      workbook.write(os)
      os.flush()
    }
  }
  catch {
    case e: Exception => e.printStackTrace()
  }
  def getSourceData(sourcePath: String):List[RowData] = {
    val inputStream: InputStream = new FileInputStream(sourcePath)
    val workBook:Workbook = new HSSFWorkbook(inputStream)
    val sheet = workBook.getSheetAt(0)
    val rows = sheet.rowIterator()
    var rowDataList: List[RowData] = List()
    //跳过第一行
    rows.next()
    while (rows.hasNext){
      val row = rows.next()
      val rowData:RowData = RowData(
        row.getCell(0).getStringCellValue,
        row.getCell(1).getStringCellValue,
        row.getCell(2).getStringCellValue,
        row.getCell(3).getStringCellValue)
      rowDataList = rowData::rowDataList
    }
    rowDataList.reverse
  }
  
  def printFile(rowDataList: List[RowData]) = {
???
  }

}
