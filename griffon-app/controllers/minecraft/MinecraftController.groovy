package minecraft

import javax.swing.JFileChooser

class MinecraftController {
  def view
  
  def openFile = {
    def openResult = view.fileChooserWindow.showOpenDialog()
    if( JFileChooser.APPROVE_OPTION == openResult ) {
    }
  }
  
  def quit = {
    app.shutdown()
  }
}