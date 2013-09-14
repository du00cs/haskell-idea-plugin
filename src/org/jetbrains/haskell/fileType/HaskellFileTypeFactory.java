package org.jetbrains.haskell.fileType;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.haskell.cabal.CabalFileType;
import org.jetbrains.haskell.fileType.HaskellFileType;


public class HaskellFileTypeFactory extends FileTypeFactory {
  public void createFileTypes(@NotNull FileTypeConsumer consumer) {
    consumer.consume(HaskellFileType.INSTANCE, HaskellFileType.DEFAULT_EXTENSION);
    consumer.consume(CabalFileType.INSTANCE, CabalFileType.DEFAULT_EXTENSION);
  }
}