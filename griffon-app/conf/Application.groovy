application {
    title = 'Minecraft'
    startupGroups = ['minecraft']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "minecraft"
    'minecraft' {
        model      = 'minecraft.MinecraftModel'
        view       = 'minecraft.MinecraftView'
        controller = 'minecraft.MinecraftController'
    }

}
