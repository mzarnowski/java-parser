package com.enkidu.lignum.parsers.ast.expression.discardable.binary

import com.enkidu.lignum.parsers.ast.expression.discardable.DiscardableExpression

case class QualifiedThisReference(name: Seq[String]) extends DiscardableExpression
