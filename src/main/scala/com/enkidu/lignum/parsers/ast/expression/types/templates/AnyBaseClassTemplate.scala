package com.enkidu.lignum.parsers.ast.expression.types.templates

import com.enkidu.lignum.parsers.ast.expression.types.annotations.Annotation
import com.enkidu.lignum.parsers.ast.expression.types.references.ReferenceType

case class AnyBaseClassTemplate(annotations: Seq[Annotation], bound: ReferenceType) extends BoundedTemplateArgument
