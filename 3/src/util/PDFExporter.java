package util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PDFExporter {
    public static void exportResults(Map<String, Long> results, String electionName, String folderPath, String fileName) throws Exception {
        if (fileName == null || fileName.isBlank()) {
            fileName = "results_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".pdf";
        }
        if (!folderPath.endsWith(File.separator)) folderPath += File.separator;

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(folderPath + fileName));
        document.open();

        document.add(new Paragraph("Результаты голосования: " + electionName));
        for (Map.Entry<String, Long> entry : results.entrySet()) {
            document.add(new Paragraph(entry.getKey() + ": " + entry.getValue() + " голосов"));
        }

        document.close();
    }
}
