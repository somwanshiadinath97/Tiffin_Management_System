import axios from 'axios'
import { toast } from 'react-toastify'
const DeliveryBoyList = (props) => {
  const { user } = props

  const DeleteDelieryBoy = () => {
    const url = `http://localhost:8082/DeliveryBoys/Delete`
    let userId = user.userId
    const body = {
      userId,
    }
    console.log(userId)
    axios.post(url, body).then((response) => {
      const result = response.data
      console.log(result['status'])
      if (result['status'] == 'success') {
        // navigate('/home')
        props.getAllCustomers()
        //props.getDeliveryBoys()
      } else {
        alert(result.error)
      }
    })
  }

  return (
    <tr>
      <td>{user.userId}</td>
      <td>{user.userName}</td>
      <td>{user.email}</td>
      <td>{user.phone}</td>
      <td>{user.aadharNo}</td>
      <td>
        <button type='button' class='btn btn-danger' onClick={DeleteDelieryBoy}>
          Delete
        </button>
      </td>
    </tr>
  )
}
export default DeliveryBoyList
