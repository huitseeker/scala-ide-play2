package org.scalaide.play2.properties

import org.eclipse.jface.preference.IPreferenceStore
import org.scalaide.play2.templateeditor.TemplateConfiguration
import org.scalaide.play2.templateeditor.scanners.TemplateDocumentPartitioner

object TemplatePreviewerFactory extends PreviewerFactory {
  
  def getConfiguration(preferenceStore: IPreferenceStore) = 
    new TemplateConfiguration(preferenceStore, null)
  
   def getDocumentPartitioner() = 
     new TemplateDocumentPartitioner()

}