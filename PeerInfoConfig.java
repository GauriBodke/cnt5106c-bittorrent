import java.util.*;
// check name in peerProcess
public class PeerInfoConfig
{
// setting adjacent peer nodes and adding to peerMap
	
	private static void settingPeerNodes(List<String> peerRows)throws Exception
	{
		peerProcess.numPeers = 0;
		for(String row:peerRows) 
		{
			int peerId = Integer.parseInt(row.split(" ")[0]);
			if(peerId == peerProcess.sourcePeerId) {
				peerProcess.currPeerIndex = peerProcess.numPeers;
				peerProcess.inputPort = Integer.parseInt(row.split(" ")[2]);
				peerProcess.fullFile = Integer.parseInt(row.split(" ")[3])==1?true:false;
			}
			else {
				NeighbourPeerNode pnObj = NeighbourPeerNode.getPeerNodeObject(row);
				peerProcess.peerNeighbors.put(peerId,pnObj);
				
			}
			peerProcess.numPeers++;
		}
		peerProcess.numPeers = peerRows.size();
		
	}

}