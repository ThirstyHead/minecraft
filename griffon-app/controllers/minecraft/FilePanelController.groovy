package minecraft

class FilePanelController {
  def model
  def view

  void mvcGroupInit(Map args) {
    model.loadedFile = args.file
    model.mvcId = args.mvcId
    execOutsideUI {
      String text = model.loadedFile.text
      execInsideUIAsync { model.fileText = text }
    }
  }

  def saveFile = {
    execOutsideUI {
      model.loadedFile.text = view.editor.text
      execInsideUIAsync { model.fileText = view.editor.text }
    }
  }
   
  def closeFile = {
    view.tabGroup.remove(view.tab)
    destroyMVCGroup(model.mvcId)
  }
}
