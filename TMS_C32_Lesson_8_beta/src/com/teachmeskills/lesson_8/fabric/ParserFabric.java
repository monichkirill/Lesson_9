package com.teachmeskills.lesson_8.fabric;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.document_parser.impl.DocxDocumentParser;
import com.teachmeskills.lesson_8.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_8.document_parser.impl.TxtDocumentParser;

public class ParserFabric {

    public static IParser createParser(String fileName){
        if(fileName.endsWith(".docx")){
            return new DocxDocumentParser();
        } else if (fileName.endsWith(".pdf")) {
            return new PdfDocumentParser();
        } else {
            return new TxtDocumentParser();
        }

        // TODO (опционально) * попробовать переписать на конструкцию switch-case, может это будет более ёмкая запись
    }

}
