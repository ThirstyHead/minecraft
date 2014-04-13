package minecraft

import javax.swing.*

class MinecraftController {
  def view
  
  def openFile = {
    def openResult = view.fileChooserWindow.showOpenDialog()
    if( JFileChooser.APPROVE_OPTION == openResult ) {
      File file = view.fileChooserWindow.selectedFile
      String mvcId = file.path + System.currentTimeMillis()
      createMVCGroup('filePanel', 
                     mvcId,
                    [file: file, 
                     tabGroup: view.tabGroup, 
                     tabName: file.name, 
                     mvcId:mvcId])
    }
  }
  
  def quit = {
    app.shutdown()
  }

  def showAddress = {
    JOptionPane.showMessageDialog(app.windowManager.windows.find{it.focused}, 
                                  "Your IP Address: " + InetAddress.localHost.hostAddress);
  }
}