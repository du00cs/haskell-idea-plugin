package org.jetbrains.cabal.psi

import com.intellij.lang.ASTNode
import com.intellij.extapi.psi.ASTWrapperPsiElement
import org.jetbrains.cabal.parser.Field

public class LicenseField(node: ASTNode) : ASTWrapperPsiElement(node), Field {
}