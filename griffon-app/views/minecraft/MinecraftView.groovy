package minecraft

actions {
   action(id: 'openAction',
        name: 'Open',
        mnemonic: 'O',
        accelerator: shortcut('O'),
        closure: controller.openFile)

   action(id: 'quitAction',
      name: 'Quit',
      mnemonic: 'Q',
      accelerator: shortcut('Q'),
      closure: controller.quit)
}


fileChooserWindow = fileChooser()
options = [title:'ModCraft', 
           size: [800,600],
           locationByPlatform:true,
           iconImage: imageIcon('/griffon-icon-48x48.png').image,
           iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                        imageIcon('/griffon-icon-32x32.png').image,
                        imageIcon('/griffon-icon-16x16.png').image]]

fileViewerWindow = application(options) {
  menuBar {
    menu('File') {
      menuItem openAction
      separator()
      menuItem quitAction
    } 
  }

  borderLayout()
  tabbedPane(id: 'tabGroup', constraints: CENTER)
}