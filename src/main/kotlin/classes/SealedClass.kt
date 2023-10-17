package classes

sealed class BirdGenra(val shortDescription: String) {
    class Accipitriformes(val families: List<String>) : BirdGenra(
        shortDescription = "Eagles, Old World vultures, secretary-birds, hawks, harriers, etc."
    )
    class Anseriformes(val families: List<String>) : BirdGenra(
        shortDescription = "Waterfowl"
    )
    class Apodiformes(val families: List<String>) : BirdGenra(
        shortDescription = "Swifts, treeswifts and hummingbirds"
    )
    class Bucerotiformes(val families: List<String>) : BirdGenra(
        shortDescription = "Hornbills, hoopoes, and wood-hoopoes"
    )
    class Caprimulgiformes(val families: List<String>) : BirdGenra(
        shortDescription = "Nightjars, nighthawks, potoos, oilbirds, frogmouths and owlet-nightjars"
    )
    class Casuariiformes(val family: String) : BirdGenra(
        shortDescription = "Casuariiformes"
    )
    class Charadriiformes(val families: List<String>) : BirdGenra(
        shortDescription = "Plovers, crab plovers, lapwings, seagulls, puffins, auks, sandpipers, buttonquails, stilts, avocets, ibisbills, woodcocks, skuas, etc."
    )
}

